import { Component, OnInit, QueryList, ViewChildren } from '@angular/core';
import { ChildComponent } from '../child/child.component';

@Component({
  selector: 'app-father',
  templateUrl: './father.component.html',
  styleUrls: ['./father.component.scss']
})
export class FatherComponent implements OnInit {

  @ViewChildren(ChildComponent) components:QueryList<ChildComponent>;

  private showChild: boolean;

  constructor() { }

  ngOnInit() {
  }

  disableButton() {
    this.showChild = !this.showChild;
  }

  shouldShow() {
    return this.showChild;
  }

  listenChild() {
    console.log(this.components);
  }
}
