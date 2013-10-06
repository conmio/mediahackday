package mediahackday



class UserStatusCheckJob {
    static triggers = {
      simple repeatInterval: 15000l // execute job once in 5 seconds
    }

    def execute() {

        log.info "Triggering the job :D"
        // execute job
    }
}
