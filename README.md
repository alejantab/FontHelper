# FontHelper
Class to manage fonts in the application automatically, just need pass the General ViewGroup.

XML
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/globalView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    // All required views (Button, TextView, ViewGroup, etc..).
    
</LinearLayout>

+ In the Java Implementation Class
// This line will apply the font to all view
FontHelper.getInstance().applyFont(findViewById(R.id.globalView));
