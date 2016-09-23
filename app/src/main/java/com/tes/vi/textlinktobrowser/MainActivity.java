package com.tes.vi.textlinktobrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.tvHello);

        //textView.setText(Html.fromHtml("Here is a <a href=\"https://icehousecorp.bamboohr.com/jobs/view.php?id=63\">link</a>"));

        /*String str = getResources().getString(R.string.onboarding_available_position);
        textView.setText(Html.fromHtml(str));
        textView.setMovementMethod(LinkMovementMethod.getInstance());*/

        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
