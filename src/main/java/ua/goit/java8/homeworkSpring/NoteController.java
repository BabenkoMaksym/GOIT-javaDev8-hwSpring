package ua.goit.java8.homeworkSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteService noteService;


    @GetMapping("/create")
    public String createNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "create";
    }

    @PostMapping("/create")
    public String createNoteSubmit(@ModelAttribute Note note) {
        noteService.add(note);
        return "redirect:/note/list";
    }
    @GetMapping("/list")
    public String list(Model model) {
        List<Note> notes = noteService.listAll();
        model.addAttribute("notes", notes);
        return "list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam Long id, Model model) {
        Note note = noteService.getById(id);
        model.addAttribute("note", note);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Note note) {
        noteService.update(note);
        return "redirect:/note/list";
    }
}

