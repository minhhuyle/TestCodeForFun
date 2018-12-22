import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildToComponent } from './child-to.component';

describe('ChildToComponent', () => {
  let component: ChildToComponent;
  let fixture: ComponentFixture<ChildToComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildToComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildToComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
