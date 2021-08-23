import { Component, OnInit } from '@angular/core';
import { ProjetoService } from 'src/app/services/controller/projeto.service';
import { Projeto } from 'src/models/projeto';

@Component({
  selector: 'app-projeto',
  templateUrl: './projeto.component.html',
  styleUrls: ['./projeto.component.scss']
})
export class ProjetoComponent implements OnInit {

  projetos: Projeto[]

  constructor(public projetoService: ProjetoService,
              ) { 

    }

  ngOnInit(): void{
    /* console.log("entrei Projetos")
    this.projetoService.getProjetos()
      .subscribe(response => {
        this.projetos = response;    
      },
      error => {
        
      }); */
      this.projetoService.getProjetos();
  }

}
