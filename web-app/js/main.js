if (typeof jQuery !== 'undefined') {
	(function($) {
		$('.js-button-login').click(function(){
            $("#loginModule").hide();
            $("#setUpModule").show();
        });


        $("#notificationSW").change(function(){
            if(this.checked){
                $(".notifications-options select").attr("disabled", "disabled");
            } else {
                $(".notifications-options select").removeAttr("disabled");
            }
        });
	})(jQuery);
}

(function($) {
    var newsCounter = 0;

    function notificate() {
        if(window.webkitNotifications) {
            var permission = window.webkitNotifications.checkPermission();

            if(permission != 0) {
                window.webkitNotifications.requestPermission();
            }

            newsCounter++;

            var notification = window.webkitNotifications.createNotification(
                '', newsCounter + ' unread news.', 'Click here to open.');

            notification.onclick = function() {
                window.open('http://stryfl.com/1j8i', '_blank');
                notification.close();
            };

            notification.show();
        }
    }
   // notificate();
    window.notificate = notificate;
})(jQuery);
