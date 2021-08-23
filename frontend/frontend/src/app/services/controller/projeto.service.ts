import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment as env } from 'src/environments/environment';
import { Projeto } from 'src/models/projeto';


@Injectable({
  providedIn: 'root'
})
export class ProjetoService {

  constructor(public http: HttpClient) { 

  }

  /* getProjetos() : Observable<Projeto[]>{
    return this.http.get<Projeto[]>(`${env.baseUrl}/projetos`);
  } */
  getProjetos(){
    this.http.get(`${env.baseUrl}/projetos`)
           .subscribe(resultado => console.log(resultado));
  }
}
