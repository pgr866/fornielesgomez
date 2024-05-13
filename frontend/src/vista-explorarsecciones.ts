import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-explorarsecciones')
export class VistaExplorarsecciones extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0; align-items: center; position: absolute;">
 <vaadin-vertical-layout style="width: 60%; height: 8%; flex-shrink: 0;">
  <vaadin-vertical-layout id="Layoutseccionesexplorarsecciones" style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; flex-direction: column; position: relative; padding: 0;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 60%; justify-content: space-between; flex-shrink: 0; align-items: center; padding-top: var(--lumo-space-xl);" id="Layoutnombrebotonesexplorarsecciones">
  <vaadin-text-field placeholder="Nombre sección" style="flex-shrink: 0; width: 45%;" id="Textfieldnombreexplorarsecciones"></vaadin-text-field>
  <vaadin-button style="width: 25%; flex-shrink: 0;" id="Buttonanadirseccionexplorarsecciones">
    Añadir sección 
  </vaadin-button>
  <vaadin-button style="width: 25%; flex-shrink: 0;" id="Buttoneliminarexplorarsecciones">
    Eliminar sección 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0;">
  <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; flex-grow: 1; justify-content: space-between; position: relative;" id="Layoutvistasnoticiasenseccionexplorarsecciones"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
