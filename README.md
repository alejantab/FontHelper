# FontHelper
Class to manage fonts in the application automatically, just need pass the General ViewGroup.

In the **FontHelper.java**, method **init()**, change the path to the required font.

##XML
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/globalView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    
    <!--FontHelper going to use the Regular Font-->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
        
        <!--FontHelper going to use the Bold Font-->
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textStyle="bold"/>
</LinearLayout>

##In the Java Implementation Class
// This line will apply the font to all view

FontHelper.getInstance().applyFont(findViewById(R.id.globalView));
