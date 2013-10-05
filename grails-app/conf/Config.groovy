// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.app.context = "/"
grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [
    all:           '*/*',
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// What URL patterns should be processed by the resources plugin
grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']

// The default codec used to encode data with ${}
grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
// enable Sitemesh preprocessing of GSP pages
grails.views.gsp.sitemesh.preprocess = true
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// AFP4W APIs
afp4w.api.base.url = "http://www.ipadafp.afp.com/afp-wanifra"
afp4w.api.IPTC.mapping = [  "eduction": "05000000",
                            "health" : "07000000",
                            "sports": "15000000"
                         ]


// Storyful APIs
storyful.api.base.url = "http://wpe.api.storyful.com/"
storyful.api.access.token = "d8e893d2958d15c7807b412f72f30ce8"
storyful.api.stories.url = "http://wpe.api.storyful.com/stories.json"
storyful.api.channel.url.mapping = [
                                        "world": "/channels/2/stories",
                                        "weather": "/channels/16/stories"
                                    ]


environments {
    development {
        grails.logging.jul.usebridge = true
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
    }
}


def catalinaBase = System.properties.getProperty('catalina.base') ?: '.'
log4j = {
    appenders {

        // log for generic application messages
        rollingFile name: "general",
                maxBackupIndex: 5,
                threshold: org.apache.log4j.Level.WARN,
                layout: pattern(conversionPattern: '%d{ISO8601} %-5p %-30.30c [%t] - %m%n'),
                file: "${catalinaBase}/logs/general.log"

        // log for api calls
        rollingFile name: "remote",
                maxBackupIndex: 5,
                threshold: org.apache.log4j.Level.INFO,
                layout: pattern(conversionPattern: '%d{ISO8601}%m%n'),
                file: "${catalinaBase}/logs/remote.log"

        // log for exceptions
        rollingFile name: 'stacktrace',
                maxBackupIndex: 5,
                layout: pattern(conversionPattern: '%d{ISO8601} %-5p %-30.30c [%t] - %m%n'),
                file: "${catalinaBase}/logs/stacktrace.log"

        // console logging for development env
        console name: 'console',
                layout: pattern(conversionPattern: '%d{ISO8601} %-5p - %m%n'),
                threshold: org.apache.log4j.Level.DEBUG
    }

    // logger to console (stdout), but only in development env
    environments {
        development {
            root { debug 'console' }
        }
        test {
        }
    }

    info general: 'grails.app' // logger for all controllers/services/taglibs/filters


    error 'org.codehaus.groovy.grails',
            'org.springframework',
            'org.hibernate',
            'net.sf.ehcache',
            'org.apache',
            'org.grails',
            'grails.util',
            'grails.plugin',
            'grails.spring',
            'grails.app.resourceMappers',
            'grails.app.taglib.org.grails.plugin',
            'grails.app.tagLib.org.grails.plugin'

    warn 'org.mortbay.log'
}


/*

Refresh Token: 1/fOgNKEooY9ltobWr8BO-CPPNPZVY2LidU8wzfHvTiXI
Client ID:  251806368150-o438edmgkgknp120gmm3bn8kndd6rokm.apps.googleusercontent.com
Secret: 4-D92NsLs3KGXLTo112lDJmj

 */
