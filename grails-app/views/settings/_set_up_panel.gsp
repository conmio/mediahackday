<div class="col">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4>Set Up</h4>
        </div>

        <div class="panel-group" id="accordion">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="collapse" href="#collapseOne">
                            Channels
                        </a>
                    </h4>
                </div>

                <div id="collapseOne" class="panel-collapse collapse in">
                    <div class="panel-body">
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
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="collapse" href="#collapseTwo">
                            Notifications
                        </a>
                    </h4>
                </div>

                <div id="collapseTwo" class="panel-collapse collapse">
                    <div class="panel-body">

                        <div class="checkbox">
                            <label>
                                <input type="checkbox" value="notifications" id="notificationSW">
                                Disable notifications
                            </label>
                        </div>
                        <section class="notifications-options">
                            <label class="notification-interval" for="notification-interval">Interval of notification</label>
                            <select multiple id="notification-interval" class="form-control">
                                <option>Realtime</option>
                                <option>Hourly</option>
                                <option>Twice per day</option>
                                <option>Once per day</option>
                            </select>

                            <label class="notification-time" for="notification-time">Specific Time</label>
                            <select multiple id="notification-time" class="form-control">
                                <option>Morning</option>
                                <option>Afternoon</option>
                                <option>Evening</option>
                                <option>Night</option>
                            </select>
                        </section>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>