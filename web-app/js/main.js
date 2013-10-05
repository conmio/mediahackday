if (typeof jQuery !== 'undefined') {
	(function($) {
		$('.js-button-login').click(function(){
            $("#loginModule").hide();
            $("#setUpModule").show();
        });
        $('.js-button-setup').click(function(){
            $("#setUpModule").hide();
            $("#localNewsModule").show();
        });
	})(jQuery);
}
