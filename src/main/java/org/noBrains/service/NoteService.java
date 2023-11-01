package org.noBrains.service;

import org.noBrains.model.Note;

import java.util.List;

public interface NoteService {
    String getAllCommands();

    Note createNote() throws Exception;

    List<Note> getNotes() throws Exception;

    boolean removeNoteById() throws Exception;

    boolean exportNotesToFile() throws Exception;

    void exit();
}
