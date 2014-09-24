package android.lib.symmetricprogressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class FakeActionBar extends FrameLayout {
    private final TextView             textView;
    private final SymmetricProgressBar progressBar;

    public FakeActionBar(final Context context) {
        this(context, null);
    }

    public FakeActionBar(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FakeActionBar(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);

        final View view = LayoutInflater.from(context).inflate(R.layout.fake_action_bar, null);

        this.addView(view);

        this.textView    = (TextView)view.findViewById(R.id.fake_action_bar_text_view);
        this.progressBar = (SymmetricProgressBar)view.findViewById(R.id.fake_action_bar_progress_bar);
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public void setText(final CharSequence text) {
        this.textView.setText(text);
    }

    public void setText(final int resId) {
        this.textView.setText(resId);
    }

    public void startAnimation() {
        this.progressBar.startAnimation();
    }

    public void stopAnimation() {
        this.progressBar.stopAnimation();
    }
}
