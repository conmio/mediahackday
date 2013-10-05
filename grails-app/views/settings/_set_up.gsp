<div>
    <h1>You are almost there!</h1>

    <p class="lead">Complete the set up to get the most relevant news content. Alternatively you can postpone this step and get started with the latest news stories based on your location.</p>

</div>

<div class="col">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4>Set Up</h4>
        </div>

        <div class="panel-group" id="accordion">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                            Channels
                        </a>
                    </h4>
                </div>

                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
                        <g:form controller="login">
                        </g:form>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="education">
                                Education
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="health">
                                Health
                            </label>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="sports">
                                Sports
                            </label>
                        </div>
                        <!-- /input-group -->
                    </div>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
                            Notifications
                        </a>
                    </h4>
                </div>

                <div id="collapseTwo" class="panel-collapse collapse">
                    <div class="panel-body">

                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="notifications">
                                Disable notifications
                            </label>
                        </div>

                        <label class="notification-interval" for="notification-interval">Interval of notification</label>
                        <select multiple id="notification-interval" class="form-control">
                            <option>Realtime</option>
                            <option>Hourly</option>
                            <option>Twice per day</option>
                            <option>Once per day</option>
                        </select>

                        <label class="notification-interval" for="notification-interval">Specific Time</label>
                        <select multiple id="notification-interval" class="form-control">
                            <option>Morning</option>
                            <option>Afternoon</option>
                            <option>Evening</option>
                            <option>Night</option>
                        </select>

                        <g:form controller="login" action="signup">
                        </g:form>
                </div>
            </div>

        </div>
    </div>
</div>
<g:form controller="login" action="signup">
    <g:submitButton name="Postpone" type="submit" class="js-button-setup btn btn-s btn-primary"/>
</g:form>