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
