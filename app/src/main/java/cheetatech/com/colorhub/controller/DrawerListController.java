package cheetatech.com.colorhub.controller;


import java.util.ArrayList;

import cheetatech.com.colorhub.R;
import cheetatech.com.colorhub.drawer.NavigationSelect;

public class DrawerListController {
    private static DrawerListController ourInstance = null;

    private String[] nameList = new String[]{
            null,
            null,
            "Your Colors",
            "Color Picker",
            "Rate This App",
            "Share This App",
            "About Us"
    };
    private int[] idList = new int[]{
            -1,
            -1,
            R.drawable.ic_action_favorites,
            R.drawable.ic_action_color_palette,
            R.drawable.ic_action_rate2,
            R.drawable.ic_action_share,
            R.drawable.ic_action_about_us
    };

    private ArrayList<NavigationSelect> navList = null;
    public static DrawerListController getInstance()
    {
        if(ourInstance == null)
            ourInstance = new DrawerListController();
        return ourInstance;
    }

    private DrawerListController() {
        if(navList == null)
            navList = new ArrayList<NavigationSelect>();
        else
            navList.clear();
        for(int i = 0;i<idList.length; i++)
        {
            navList.add(new NavigationSelect(nameList[i],idList[i]));
        }
    }
    public ArrayList<NavigationSelect> getNavList()
    {
        return this.navList;
    }

}
