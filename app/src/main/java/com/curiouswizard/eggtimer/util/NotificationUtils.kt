package com.curiouswizard.eggtimer.util

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import com.curiouswizard.eggtimer.R

// Notification ID.
private val NOTIFICATION_ID = 0
private val REQUEST_CODE = 0
private val FLAGS = 0

/**
 * Builds and delivers the notification.
 *
 * @param messageBody, notification text.
 * @param context, activity context.
 */
fun NotificationManager.sendNotification(messageBody: String, applicationContext: Context) {
    // Create the content intent for the notification, which launches
    // this activity
    // TODO: Step 1.11 create intent

    // TODO: Step 1.12 create PendingIntent

    // TODO: Step 2.0 add style

    // TODO: Step 2.2 add snooze action

    // Build the notification
    val builder = NotificationCompat.Builder(
            applicationContext,
            applicationContext.getString(R.string.egg_notification_channel_id)
    )

    // TODO: Step 1.8 use the new 'breakfast' notification channel

        .setSmallIcon(R.drawable.cooked_egg)
        .setContentTitle(applicationContext.getString(R.string.notification_title))
        .setContentText(messageBody)
    // TODO: Step 1.13 set content intent

    // TODO: Step 2.1 add style to builder

    // TODO: Step 2.3 add snooze action

    // TODO: Step 2.5 set priority

    notify(NOTIFICATION_ID,builder.build())
}

// TODO: Step 1.14 Cancel all notifications