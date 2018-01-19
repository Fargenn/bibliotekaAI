package pl.wat.bibliotekaAI.Service;

import org.springframework.stereotype.Service;
import pl.wat.bibliotekaAI.dao.ZamowienieDAO;

import javax.transaction.Transactional;

@Service
@Transactional
public class ZamowienieService {

    private final ZamowienieDAO zD;

    public ZamowienieService(ZamowienieDAO zD) {
        this.zD = zD;
    }
}
