/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Locale;

/**
 *
 * @author arthur0610
 */
public class Rooster extends Chicken {
    
    public Rooster() {

        switch (Locale.getDefault().getLanguage()) {
            case "da":
                sound = "kukeleku";
                break;
            case "nl":
                sound = "kukeleku";
                break;
            case "fi":
                sound = "French";
                break;
            case "de":
                sound = "kukeleku";
                break;
            case "el":
                sound = "kikiriki";
                break;
            case "he":
                sound = "coo-koo-ri-koo";
                break;
            case "hu":
                sound = "kukuriku";
                break;
            case "it":
                sound = "chicchirichi";
                break;
            case "ja":
                sound = "ko-ke-kok-ko-o";
                break;
            case "pt":
                sound = "cucurucu";
                break;
            case "ru":
                sound = "kukareku";
                break;
            case "sv":
                sound = "kuckeliku";
                break;
            case "tr":
                sound = "kuk-kurri-kuuu";
                break;
            case "ur":
                sound = "kuklooku";
                break;
            default:
                sound = "Cock-a-doodle-doo";
        }
        gender = "male";
    }
    
}
