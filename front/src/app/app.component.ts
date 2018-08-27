import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  waterfall = true;

  expansionRatio:number

  updateExpansionRatio(ratio: number) {
    this.expansionRatio = ratio;
  }
}
