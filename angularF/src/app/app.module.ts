import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FatherComponent } from './father/father.component';
import { ChildComponent } from './child/child.component';
import { ChildToComponent } from './child-to/child-to.component';

@NgModule({
  declarations: [
    AppComponent,
    FatherComponent,
    ChildComponent,
    ChildToComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
