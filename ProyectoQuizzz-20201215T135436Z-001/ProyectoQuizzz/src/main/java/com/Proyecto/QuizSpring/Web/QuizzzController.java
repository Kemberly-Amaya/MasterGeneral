package com.Proyecto.QuizSpring.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Proyecto.QuizSpring.DAO.QuizzzDAO;
import com.Proyecto.QuizSpring.Entidades.Quizzz;

@Controller
public class QuizzzController {

	@Autowired
	private QuizzzDAO qDao;

	@GetMapping("/")
	public String Inicio(/*Model m*/) {

		/*var MostrarUsuarios = qDao.findAll();

		m.addAttribute("user", MostrarUsuarios);*/

		return "index";
	}

	@GetMapping("/quiz")
	private String quiz() {

		return "quiz";
	}
	
	@GetMapping("/Puntaje")
	private String puntaje(Model m) {
		
		var MostrarUsuarios = qDao.findAll();

		m.addAttribute("user", MostrarUsuarios);
		
		return "Puntaje";
	}
	
	

	

	@PostMapping("/guardar")
	private String guardar(@RequestParam("p1") String P1, @RequestParam("p2") String P2, @RequestParam("p3") String P3,
			@RequestParam("nombre") String nombre, Quizzz quizzz) {

		int total = 4;
		int puntaje = 0;

		String respuestasUsu[] = { P1, P2, P3 };
		String respuestas[] = { "a", "b", "c" };

		for (int i = 1; i < total; i++) {
			if (respuestasUsu[i - 1].equals(respuestas[i - 1])) {
				System.out.print("\nrespuesta " + i + ": correcta---\n");
				++puntaje;
			} else {
				System.out.print("\nrespuesta " + i + ": incorrecta---\n");
			}

		}

		System.out.println("\n" + nombre + " tus puntos son: " + puntaje + "\n");
		System.out.print("Respuestas del usuario:");
		System.out.print(P1);
		System.out.println(P2);
		System.out.println(P3 + "\n");
		System.out.print("\nRespuestas:");
		System.out.print(respuestas[0]);
		System.out.print(respuestas[1]);
		System.out.print(respuestas[2]);
		System.out.println("\n");

		return "redirect:/";

	}
}
