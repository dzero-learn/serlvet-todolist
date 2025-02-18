package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
	INSTANCE;

	public void register(TodoDTO todoDTO) {
		System.out.println("debug............" + todoDTO);
	}

	public List<TodoDTO> getList() {
		List<TodoDTO> todoDTOS = IntStream.range(0, 10).mapToObj(i -> {
			TodoDTO dto = new TodoDTO();
			dto.setTno(Long.valueOf(i));
			dto.setTitle("Todo.." + i);
			dto.setDueDate(LocalDate.now());

			return dto;
		}).collect(Collectors.toList());

		return todoDTOS;
	}
}