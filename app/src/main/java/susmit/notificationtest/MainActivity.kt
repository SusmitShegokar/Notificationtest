package susmit.notificationtest

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun notify(v:View)
    {
        var nManager=getSystemService(Context.NOTIFICATION_SERVICE)
                as NotificationManager
        var builder=NotificationCompat.Builder(this,
                "")
        builder.setSmallIcon(R.drawable.ic_captain_america)
        builder.setTicker("Avengers massage for demo")
        builder.setContentTitle("THANOS ATTACK AGAIN PLZZ CONTACT SHAKTIMAN.......")
        builder.setSubText("ALERT MASSAGE")
        builder.setAutoCancel(true)
        var i=Intent(this,MainActivity::class.java)
        var pIntent=PendingIntent.getActivity(this,0,
                i,0)
        builder.setContentIntent(pIntent)
        nManager.notify(123,builder.build())
    }

}
