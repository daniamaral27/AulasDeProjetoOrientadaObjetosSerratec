package br.org.serratec.datas;

import java.time.Duration;
import java.time.LocalDateTime;

public class TesteDuration {

	public static void main(String[] args) {
		LocalDateTime primeiroPeriodo = LocalDateTime.now();
		LocalDateTime segundoPeriodo = LocalDateTime.of(2022, 12, 17, 22, 00);
		
		Duration duration = Duration.between(primeiroPeriodo, segundoPeriodo);
		Long dias = duration.toDays();
		System.out.println(dias);
		
		Duration duration2 = duration.minusDays(2);
		System.out.println(duration2.toHours());
		
		
	}

}
