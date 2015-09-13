/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the ClassOptionalWrapper class.
 * @constructor
 * @member {object} [value]
 * 
 * @member {number} [value.id]
 * 
 * @member {string} [value.name]
 * 
 */
function ClassOptionalWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.value !== null && parameters.value !== undefined) {
      this.value = new models['Product'](parameters.value);
    }
  }    
}


/**
 * Validate the payload against the ClassOptionalWrapper schema
 *
 * @param {JSON} payload
 *
 */
ClassOptionalWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['value']) {
    payload['value'] = this['value'].serialize();
  }
};

/**
 * Deserialize the instance to ClassOptionalWrapper schema
 *
 * @param {JSON} instance
 *
 */
ClassOptionalWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.value !== null && instance.value !== undefined) {
      this.value = new models['Product']().deserialize(instance.value);
    }
  }
};

module.exports = ClassOptionalWrapper;
