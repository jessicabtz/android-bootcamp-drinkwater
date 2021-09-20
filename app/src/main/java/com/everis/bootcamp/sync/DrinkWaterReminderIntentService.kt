package com.everis.bootcamp.sync

import android.app.IntentService
import android.content.Intent

class DrinkWaterReminderIntentService : IntentService("DrinkWaterReminderIntentService"){

    override fun onHandleIntent(p0: Intent?) {
        val action = p0?.action
        DrinkWaterReminderTask.executeTask(this, action)
    }

}