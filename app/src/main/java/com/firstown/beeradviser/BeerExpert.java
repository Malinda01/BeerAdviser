package com.firstown.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> recommendBeer(String selectedColor) {
        List<String> recommendations = new ArrayList();

        if(selectedColor.equals("Amber")) {
            recommendations.add("Amber beer 1");
            recommendations.add("Amber beer 2");
        }else if (selectedColor.equals("Red")){
            recommendations.add("Red beer 1");
            recommendations.add("Red beer 2");
        } else if (selectedColor.equals("Green")){
            recommendations.add("Green beer 1");
            recommendations.add("Green beer 2");
        } else if (selectedColor.equals("Blue")) {
            recommendations.add("Blue beer 1");
            recommendations.add("Blue beer 2");
        }

        return recommendations;
    }
}
