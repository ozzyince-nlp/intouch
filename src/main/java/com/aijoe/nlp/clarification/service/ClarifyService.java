package com.aijoe.nlp.clarification.service;

import java.util.List;

public interface ClarifyService {
    List<String> fixSpellMistake(List<String> sentences);
}