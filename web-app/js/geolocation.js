(function($) {
    function locate() {
        if (!navigator.geolocation){
            return;
        }

        function success(position) {
            var latitude  = position.coords.latitude;
            var longitude = position.coords.longitude;

            var url = "http://maps.googleapis.com/maps/api/geocode/json" +
                "?latlng=" + latitude + "," + longitude + "&sensor=false";

            var foundCity = false;
            var foundCountry = false;

            var city, country;

            $.getJSON(url).done(function(data) {
                var results = data.results;
                if (results[1]) {
                    for (var i=0; i<results[0].address_components.length; i++) {
                        for (var b=0;b<results[0].address_components[i].types.length;b++) {
                            if (!foundCity && results[0].address_components[i].types[b] == "administrative_area_level_1") {

                                city = results[0].address_components[i];
                                foundCity = true;
                            }
                            if (!foundCountry && results[0].address_components[i].types[b] == "country") {

                                country = results[0].address_components[i];
                                foundCity = true;
                            }
                        }
                    }

                    city = city.long_name.toLowerCase();
                    country = country.long_name.toLowerCase();
                    
                    console.log("You're currently in " + city + ', ' + country);
                }
            });
        };

        function error() {
        };

        navigator.geolocation.getCurrentPosition(success, error);
    }

    locate();
})(jQuery);