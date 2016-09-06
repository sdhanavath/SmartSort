package edu.adias.smart.sort;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {
	
	@RequestMapping(path= "/sort", method= RequestMethod.POST)
    public @ResponseBody SortResult sort(@RequestBody SortResult sort){
	
		SortResult result = new SortResult();
		result.setNumbers(sort.getNumbers().clone());
		ZonedDateTime now = ZonedDateTime.now();
		result.setNumberOfSwaps(SortNumbers.sort(sort.getNumbers()));
		long seconds = now.until(ZonedDateTime.now(), ChronoUnit.SECONDS);
		result.setAfterSort(sort.getNumbers());
		result.setExecutionTime(seconds);
    	return result;
   
    }
}
