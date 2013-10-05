if (typeof jQuery !== 'undefined') {
	(function($) {
		$('.js-button-login').click(function(){
            $("#loginModule").hide();
            $("#setUpModule").show();
        });

	})(jQuery);
}
