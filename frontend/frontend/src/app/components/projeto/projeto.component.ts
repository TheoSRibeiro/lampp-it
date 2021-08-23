import { Component, OnInit } from '@angular/core';
import { ProjetoService } from 'src/app/services/controller/projeto.service';
import { Projeto } from 'src/models/projeto';

import Swal from 'sweetalert2/dist/sweetalert2.js';

@Component({
  selector: 'app-projeto',
  templateUrl: './projeto.component.html',
  styleUrls: ['./projeto.component.scss']
})
export class ProjetoComponent implements OnInit {

  projetos: Projeto[]
  order: string = 'id'

  constructor(public projetoService: ProjetoService,
              
              ) { 

    }

  ngOnInit(): void{
    
    this.projetoService.getProjetos()
      .subscribe(response => {
        this.projetos = response
        this.projetos.sort().reverse()
        

        
      },
      error => {
        
      });
      //this.projetoService.getProjetos();
      
  }

  deletar(obj: Projeto){
    this.projetoService.deleteProjeto(obj)  
    this.refresh();
  }

  refresh(): void {
    window.location.reload();
  }
   
  confirmeExcluir(obj: Projeto){
    Swal.fire({
      title: 'Tem certeza que deseja remover?',
      text: 'Você não poderá rever esse projeto',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'SIM!',
      cancelButtonText: 'Não!'
    }).then((result) => {
      if (result.value) {
        this.deletar(obj)

        Swal.fire(
          'Excluído!',
          'O projeto foi excluído',
          'successo'
        )
      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelado',
          'Você não excluíu o Projeto',
          'erro'
        )
      }
    })
  }

}
