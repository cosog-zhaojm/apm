Ext.define('AP.model.org.OrgInfoModel', {
    extend: 'Ext.data.TreeModel',
    fields: [{
        name: 'orgId',
        type: 'int'
     }, {
        name: 'text',
        type: 'string'
     }, {
        name: 'orgMemo',
        type: 'string'
     }, {
        name: 'orgCode',
        type: 'string'
     }, {
        name: 'orgLevel',
        type: 'string'
     }, {
        name: 'orgType',
        type: 'string'
     }, {
        name: 'orgTypeName',
        type: 'string'
     }, {
        name: 'orgParent',
        type: 'string'
     }, {
         name: 'orgCoordX',
         type: 'float'
      }, {
         name: 'orgCoordY',
         type: 'float'
      }, {
          name: 'showLevel',
          type: 'int'
       }],
       idProperty: 'threadid'

});