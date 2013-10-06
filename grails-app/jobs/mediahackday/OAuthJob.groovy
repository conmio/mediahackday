package mediahackday

import groovyx.net.http.ContentType



class OAuthJob {
    static triggers = {
      simple repeatInterval: 300000l,  startDelay:5000 // execute job once in 5 seconds ,


    }

    def httpService



    def execute() {
        Map<String,?> params = [:]
        params.query = [
                'client_id':'251806368150-o438edmgkgknp120gmm3bn8kndd6rokm.apps.googleusercontent.com',
                'client_secret':'4-D92NsLs3KGXLTo112lDJmj',
                'refresh_token':'1/59lSnautKBykRMOMcZGep4Plxj5BSdqvidVgeM8n1TA',
                'grant_type':'refresh_token',

        ]

        params.contentType = ContentType.JSON

        def keys  = httpService.nonCachedRequest("https://accounts.google.com/o/oauth2/token", "post", params)
        if(keys.access_token){

            UserStatusCheckJob.schedule(30000l, 1, [feed:keys, query: params.query]);

        }

    }
}
