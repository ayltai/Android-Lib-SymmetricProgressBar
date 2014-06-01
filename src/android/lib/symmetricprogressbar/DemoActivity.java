package android.lib.symmetricprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

public final class DemoActivity extends Activity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final SymmetricProgressBar progressBar = new SymmetricProgressBar(this);
        progressBar.setId(123);

        ((ViewGroup)this.findViewById(android.R.id.content)).addView(progressBar, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 8));

        progressBar.startAnimation();
    }
}
