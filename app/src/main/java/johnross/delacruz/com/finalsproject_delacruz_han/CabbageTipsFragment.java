package johnross.delacruz.com.finalsproject_delacruz_han;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CabbageTipsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cabbage_tips, container, false);

        TextView pests = v.findViewById(R.id.cabbage_pests);
        pests.setText(R.string.pests_cabbage);

        TextView harvest = v.findViewById(R.id.cabbage_harvest);
        harvest.setText(R.string.harvest_cabbage);

        return v;
    }
}
