import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.scss']
})
export class ChildComponent implements OnInit {

  private static instanceCount = 0;

  private count: number;

  constructor() {
    this.count = ++ChildComponent.instanceCount;
  }

  ngOnInit() {
  }

  getText() {
    return this.count;
  }
}
