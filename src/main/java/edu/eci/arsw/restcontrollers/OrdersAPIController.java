/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.restcontrollers;

import edu.eci.arsw.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan
 */

@RestController
@RequestMapping(value = "/apialpha") 
 public class OrdersAPIController {
    @Autowired
        @Qualifier("Stub")
        ApiService apiservice;
        
 	@GetMapping("/{name}")
 	public ResponseEntity<?> GetJsonAlpha(@PathVariable String name){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getAllJSON(name),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404",HttpStatus.NOT_FOUND);
 		}  
 	}
        @GetMapping("/{name}/daily")
 	public ResponseEntity<?> GetJsonAlphaDaily(@PathVariable String name){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getJSONDaily(name),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404",HttpStatus.NOT_FOUND);
 		}  
 	}
        @GetMapping("/{name}/intraday")
 	public ResponseEntity<?> GetJsonIntraDay(@PathVariable String name){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getJSONIntraDay(name),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404",HttpStatus.NOT_FOUND);
 		}  
 	}
        @GetMapping("/{name}/monthly")
 	public ResponseEntity<?> GetJsonMonthly(@PathVariable String name){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getJSONMonthly(name),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404",HttpStatus.NOT_FOUND);
 		}  
 	}
        @GetMapping("/{name}/weekly")
        public ResponseEntity<?> GetJsonWeekly(@PathVariable String name){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getJSONWeekly(name),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404",HttpStatus.NOT_FOUND);
 		}  
 	}
        
}       
 

