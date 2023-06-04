package pl.edu.wszib.jwd.colors.serwis.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwd.colors.dao.SelectedColorDao;
import pl.edu.wszib.jwd.colors.model.SelectedColor;
import pl.edu.wszib.jwd.colors.serwis.SelectedColorService;

import java.util.Date;
import java.util.List;

@Service
public class SelectedColorServiceImpl implements SelectedColorService {
    @Autowired
    SelectedColorDao selectedColorDao;

    @Override
    public void save(String color) {
        selectedColorDao.save(new SelectedColor(color, new Date()));
    }

    @Override
    public void save(SelectedColor selectedColor) {
        this.save(selectedColor.getColor());
    }

    @Override
    public List<SelectedColor> getAllData() {
        return (List<SelectedColor>)selectedColorDao.findAll();
    }
}
