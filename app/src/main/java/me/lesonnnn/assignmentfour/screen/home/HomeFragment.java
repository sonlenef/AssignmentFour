package me.lesonnnn.assignmentfour.screen.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.lesonnnn.assignmentfour.R;
import me.lesonnnn.assignmentfour.model.User;
import me.lesonnnn.assignmentfour.screen.home.adapter.HomeAdapter;
import me.lesonnnn.assignmentfour.screen.main.MainActivity;
import me.lesonnnn.assignmentfour.util.onClickFragmentInterface;

public class HomeFragment extends Fragment implements HomeAdapter.onClickContentViewItem{

    private List<User> userList = new ArrayList<>();
    public HomeAdapter mainAdapter;
    public static onClickFragmentInterface listener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        initView(rootView);
        return rootView;
    }

    @SuppressLint("NewApi")
    private void initView(View a) {

        RecyclerView recyclerView = a.findViewById(R.id.content);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(layoutManager);

        userList = addProfile(userList);

        mainAdapter = new HomeAdapter(userList, getActivity());
        mainAdapter.setClickContentViewItem(this);
        recyclerView.setAdapter(mainAdapter);
    }

    private List<User> addProfile(List<User> users) {

        User.UserBuilder userBuilder = new User.UserBuilder();

        users.add(userBuilder.id(0)
                .image(R.drawable.gai00)
                .name("Nguoi Nao Do")
                .birthday("04/12/2000")
                .build());
        users.add(userBuilder.id(1)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("16/02/2000")
                .build());
        users.add(userBuilder.id(2)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("01/03/1998")
                .build());
        users.add(userBuilder.id(3)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("15/12/1998")
                .build());
        users.add(userBuilder.id(4)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/07/1999")
                .build());
        users.add(userBuilder.id(5)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("03/09/1998")
                .build());
        users.add(userBuilder.id(6)
                .image(R.drawable.gai05)
                .name("Nguoi Nao Do")
                .birthday("14/02/1999")
                .build());
        users.add(userBuilder.id(7)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("23/09/1997")
                .build());
        users.add(userBuilder.id(8)
                .image(R.drawable.gai07)
                .name("Nguoi Nao Do")
                .birthday("08/04/1998")
                .build());
        users.add(userBuilder.id(9)
                .image(R.drawable.gai08)
                .name("Nguoi Nao Do")
                .birthday("27/09/1998")
                .build());
        users.add(userBuilder.id(10)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/10/1998")
                .build());
        users.add(userBuilder.id(11)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(12)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(13)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/03/1998")
                .build());
        users.add(userBuilder.id(14)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1997")
                .build());
        users.add(userBuilder.id(15)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(16)
                .image(R.drawable.gai00)
                .name("Nguoi Nao Do")
                .birthday("08/09/1997")
                .build());
        users.add(userBuilder.id(17)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/09/1999")
                .build());
        users.add(userBuilder.id(18)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(19)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(20)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(21)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/2000")
                .build());
        users.add(userBuilder.id(22)
                .image(R.drawable.gai05)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(23)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(24)
                .image(R.drawable.gai07)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(25)
                .image(R.drawable.gai08)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(26)
                .image(R.drawable.gai01)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(27)
                .image(R.drawable.gai02)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(28)
                .image(R.drawable.gai03)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(29)
                .image(R.drawable.gai04)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(30)
                .image(R.drawable.gai06)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        users.add(userBuilder.id(31)
                .image(R.drawable.gai09)
                .name("Nguoi Nao Do")
                .birthday("08/09/1998")
                .build());
        return users;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity)
            listener = (onClickFragmentInterface) context; // gan listener vao MainActivity
        else
            throw new RuntimeException(context.toString() + " must implement onViewSelected!");
    }

    @Override
    public void onClick(int position) {
        listener.onClickHomeFragment(userList.get(position));
    }
}
