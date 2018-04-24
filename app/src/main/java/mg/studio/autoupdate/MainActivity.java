package mg.studio.autoupdate;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import mg.studio.autoupdater.lib.AppUtils;
import mg.studio.autoupdater.lib.UpdateChecker;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Display the current version name and the current version code
        String currentVersionName = AppUtils.getVersionName(getBaseContext());
        int currentVersionCode = AppUtils.getVersionCode(this);
        String information = "Current versionName = " + currentVersionName +
                " Current versionCode = " + currentVersionCode;
        ((TextView) findViewById(R.id.display)).setText(information);

    }

    /**
     * Start the update and show a notification
     *
     * @param view
     */
    public void btnNotificationUpdate(View view) {
        UpdateChecker.checkForNotification(MainActivity.this);

    }

    /**
     * Start the update and show a dialog
     *
     * @param view
     */
    public void btnDialogUpdate(View view) {
        UpdateChecker.checkForDialog(MainActivity.this);

    }
}
