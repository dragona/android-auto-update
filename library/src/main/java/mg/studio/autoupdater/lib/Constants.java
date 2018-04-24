package mg.studio.autoupdater.lib;

class Constants {




    static final String APK_DOWNLOAD_URL = "url";
    static final String APK_VERSION_CODE = "versionCode";
    static final String APK_UPDATE_CONTENT = "updateMessage";


    static final int TYPE_NOTIFICATION = 2;
    static final int TYPE_DIALOG = 1;
    static final String TAG = "UpdateChecker";
    static final String UPDATE_URL = "http://mpianatra.com/Courses/api_auto_update/index.php";

    /*
    The return from the server is in json format
    {
      "url":"http://mpianatra.com/Courses/api_auto_update/file.apk",
      "versionCode":2,
      "updateMessage":"1. New background \n 2. New updated link"
    }
     */
}
