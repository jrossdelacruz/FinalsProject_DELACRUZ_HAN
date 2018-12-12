package johnross.delacruz.com.finalsproject_delacruz_han;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlueberriesTipsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blueberries_tips, container, false);

        TextView pests = v.findViewById(R.id.blueberries_pests);
        pests.setText(R.string.pests_blueberries);

        TextView harvest = v.findViewById(R.id.blueberries_harvest);
        harvest.setText(R.string.harvest_blueberries);

        return v;
    }
}
