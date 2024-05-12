import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscaridentificado')
export class VistaBuscaridentificado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; justify-content: center;" id="Layoutvistasbuscaridentificado"></vaadin-vertical-layout>
<vaadin-vertical-layout id="Layoutvistasbuscareditor" style="width: 100%; height: 100%; justify-content: center;"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}