package ua.goit.java8.homeworkSpring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final Random random = new Random();

    private final NoteRepository repository;

    public List<Note> listAll() {
        return repository.findAll();
    }

    public Note add(Note note) {
        long id = random.nextLong();
        note.setId(id);
        repository.save(note);
        return note;
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void update(Note note) {
        repository.save(note);
    }

    public Note getById(long id) {
        return repository.getReferenceById(id);
    }
}

