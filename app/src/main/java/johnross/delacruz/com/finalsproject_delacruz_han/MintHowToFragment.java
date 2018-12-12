package johnross.delacruz.com.finalsproject_delacruz_han;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MintHowToFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mint_howto, container, false);

        TextView planting = v.findViewById(R.id.mint_planting);
        planting.setText(R.string.planting_mint);

        TextView care = v.findViewById(R.id.mint_care);
        care.setText(R.string.care_mint);

        return v;
    }
}
