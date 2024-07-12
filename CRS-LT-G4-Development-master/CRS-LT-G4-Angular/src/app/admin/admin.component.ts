import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login/login.service';
import { Router } from '@angular/router';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  comp:boolean=false;
  generate:boolean=false;
  x: boolean = false;
  y: boolean = false;
  z: boolean = false;
  a: boolean = false;
  b: boolean = false;
  notificationCount:number=0;
  todayDate:Date = new Date();
  
  constructor(private loginService: LoginService,private router: Router) { }

  username = this.loginService.getUsername();
 
  ngOnInit(): void {
  }
  
    logout(){
        this.loginService.userLoggedOut().subscribe(
          response => {
            console.log(response);
            this.router.navigate(['/login']);
          });
    }

    validate(){
      this.comp=!this.comp;
      this.generate=false;
      this.x=false;
      this.y=false;
      this.a=false;
      this.b=false;
    }

    generateReportCard(){
      this.comp=false;
      this.generate=!this.generate;
      this.x=false;
      this.y=false;
      this.a=false;
      this.b=false;
    }
    addProfessor(){
      this.comp=false;
      this.generate=false;
      this.x=!this.x;
      this.y=false;
      this.a=false;
      this.b=false;
    }

    deleteProfessor(){
      this.comp=false;
      this.generate=false;
      this.x=false;
      this.y=!this.y;
      this.a=false;
      this.b=false;
    }

    createCourse () {
      this.comp=false;
      this.generate=false;
      this.x=false;
      this.y=false;
      this.a=!this.a;
      this.b=false;
    }

    deleteCourse() {
      this.comp=false;
      this.generate=false;
      this.x=false;
      this.y=false;
      this.a=false;
      this.b=!this.b;
    }
    
}
