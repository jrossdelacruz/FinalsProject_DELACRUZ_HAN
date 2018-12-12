package johnross.delacruz.com.finalsproject_delacruz_han;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        setTitle("Cabbage");

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_closed);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CabbageFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_cabbage);
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (getTitle() == "Cabbage") {
                        switch (item.getItemId()) {
                            case R.id.bnav_info:
                                selectedFragment = new CabbageFragment();
                                break;
                            case R.id.bnav_howto:
                                selectedFragment = new CabbageHowToFragment();
                                break;
                            case R.id.bnav_tips:
                                selectedFragment = new CabbageTipsFragment();
                                break;
                            case R.id.bnav_gallery:
                                selectedFragment = new CabbageGalleryFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    } else if (getTitle() == "Blueberries") {
                        switch (item.getItemId()) {
                            case R.id.bnav_info:
                                selectedFragment = new BlueberriesFragment();
                                break;
                            case R.id.bnav_howto:
                                selectedFragment = new BlueberriesHowToFragment();
                                break;
                            case R.id.bnav_tips:
                                selectedFragment = new BlueberriesTipsFragment();
                                break;
                            case R.id.bnav_gallery:
                                selectedFragment = new BlueberriesGalleryFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    } else if (getTitle() == "Mint") {
                        switch (item.getItemId()) {
                            case R.id.bnav_info:
                                selectedFragment = new MintFragment();
                                break;
                            case R.id.bnav_howto:
                                selectedFragment = new MintHowToFragment();
                                break;
                            case R.id.bnav_tips:
                                selectedFragment = new MintTipsFragment();
                                break;
                            case R.id.bnav_gallery:
                                selectedFragment = new MintGalleryFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    }

                    return true;
                }
            };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.bnav_info);

        switch (menuItem.getItemId()) {
            case R.id.nav_cabbage:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CabbageFragment()).commit();
                setTitle("Cabbage");
                break;
            case R.id.nav_blueberries:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BlueberriesFragment()).commit();
                setTitle("Blueberries");
                break;
            case R.id.nav_mint:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MintFragment()).commit();
                setTitle("Mint");
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
