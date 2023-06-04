package pl.edu.wszib.jwd.colors.serwis;

import org.springframework.stereotype.Service;
import pl.edu.wszib.jwd.colors.model.SelectedColor;

import java.util.List;


public interface SelectedColorService {

    void save(String color);
    void save(SelectedColor selectedColor);
    List<SelectedColor> getAllData();
}
