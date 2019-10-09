package me.lesonnnn.assignmentfour.screen.main;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import me.lesonnnn.assignmentfour.R;
import me.lesonnnn.assignmentfour.model.User;
import me.lesonnnn.assignmentfour.screen.detail.DetailFragment;
import me.lesonnnn.assignmentfour.screen.home.HomeFragment;
import me.lesonnnn.assignmentfour.util.onClickFragmentInterface;

public class MainActivity extends AppCompatActivity implements onClickFragmentInterface {

    private FrameLayout mDetailFragment, mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.homeFragment, new HomeFragment(), "HomeFragment")
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detailFragment, new DetailFragment())
                    .commit();
        }
        initView();
    }

    private void initView() {

        mDetailFragment = findViewById(R.id.detailFragment);
        mHomeFragment = findViewById(R.id.homeFragment);

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mDetailFragment.setVisibility(View.VISIBLE);
        } else {
            mDetailFragment.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClickHomeFragment(User user) {
        DetailFragment detailFragment =
                (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);

        if (detailFragment != null
                || detailFragment.isInLayout()) { // kiem tra fragment can truyen data den co
            // thuc su ton tai va dang hien
            detailFragment.showInfo(user);
        } else {
            Toast.makeText(getApplicationContext(), "Fragment is not exist", Toast.LENGTH_LONG)
                    .show();
        }

        int orientation = getResources().getConfiguration().orientation;
        if (orientation != Configuration.ORIENTATION_LANDSCAPE) {
            mHomeFragment.setVisibility(View.GONE);
            mDetailFragment.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClickDetailFragment(int id) {
        HomeFragment home =
                (HomeFragment) getSupportFragmentManager().findFragmentById(R.id.homeFragment);
        home.mainAdapter.notifyItemChanged(id);
    }

    @Override
    public void onBackPressed() {
        if (getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
            if (mDetailFragment.getVisibility() == View.VISIBLE) {
                mHomeFragment.setVisibility(View.VISIBLE);
                mDetailFragment.setVisibility(View.GONE);
            } else {
                super.onBackPressed();
            }
        }
    }
}
