import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProjetoComponent } from './components/projeto/projeto.component';

const routes: Routes = [
  { 
    path: '',
    component: HomeComponent
  },
  {
    path: 'projetos',
    component: ProjetoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
