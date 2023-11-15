// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error pages, and configuring default tenant behaviors.
//
// > Creating tenants through the Management API is not currently supported. Therefore, this resource can only
// manage an existing tenant created through the Auth0 dashboard.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewTenant(ctx, "myTenant", &auth0.TenantArgs{
//				AllowedLogoutUrls: pulumi.StringArray{
//					pulumi.String("http://example.com/logout"),
//				},
//				DefaultRedirectionUri: pulumi.String("https://example.com/login"),
//				EnabledLocales: pulumi.StringArray{
//					pulumi.String("en"),
//				},
//				Flags: &auth0.TenantFlagsArgs{
//					DisableClickjackProtectionHeaders:  pulumi.Bool(true),
//					DisableFieldsMapFix:                pulumi.Bool(false),
//					DisableManagementApiSmsObfuscation: pulumi.Bool(false),
//					EnablePublicSignupUserExistsError:  pulumi.Bool(true),
//					NoDiscloseEnterpriseConnections:    pulumi.Bool(false),
//					UseScopeDescriptionsForConsent:     pulumi.Bool(true),
//				},
//				FriendlyName:   pulumi.String("Tenant Name"),
//				PictureUrl:     pulumi.String("http://example.com/logo.png"),
//				SandboxVersion: pulumi.String("12"),
//				SessionCookie: &auth0.TenantSessionCookieArgs{
//					Mode: pulumi.String("non-persistent"),
//				},
//				SessionLifetime: pulumi.Float64(8760),
//				Sessions: &auth0.TenantSessionsArgs{
//					OidcLogoutPromptEnabled: pulumi.Bool(false),
//				},
//				SupportEmail: pulumi.String("support@example.com"),
//				SupportUrl:   pulumi.String("http://example.com/support"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// As this is not a resource identifiable by an ID within the Auth0 Management API, tenant can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
//
// ```sh
//
//	$ pulumi import auth0:index/tenant:Tenant my_tenant "82f4f21b-017a-319d-92e7-2291c1ca36c4"
//
// ```
type Tenant struct {
	pulumi.CustomResourceState

	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi pulumi.BoolOutput `pulumi:"allowOrganizationNameInAuthenticationApi"`
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayOutput `pulumi:"allowedLogoutUrls"`
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringOutput `pulumi:"defaultAudience"`
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringOutput `pulumi:"defaultDirectory"`
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri pulumi.StringOutput `pulumi:"defaultRedirectionUri"`
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayOutput `pulumi:"enabledLocales"`
	// Configuration settings for tenant flags.
	Flags TenantFlagsOutput `pulumi:"flags"`
	// Friendly name for the tenant.
	FriendlyName pulumi.StringOutput `pulumi:"friendlyName"`
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrOutput `pulumi:"idleSessionLifetime"`
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringOutput `pulumi:"pictureUrl"`
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringOutput `pulumi:"sandboxVersion"`
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookie TenantSessionCookieOutput `pulumi:"sessionCookie"`
	// Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrOutput `pulumi:"sessionLifetime"`
	// Sessions related settings for the tenant.
	Sessions TenantSessionsOutput `pulumi:"sessions"`
	// Support email address for authenticating users.
	SupportEmail pulumi.StringOutput `pulumi:"supportEmail"`
	// Support URL for authenticating users.
	SupportUrl pulumi.StringOutput `pulumi:"supportUrl"`
}

// NewTenant registers a new resource with the given unique name, arguments, and options.
func NewTenant(ctx *pulumi.Context,
	name string, args *TenantArgs, opts ...pulumi.ResourceOption) (*Tenant, error) {
	if args == nil {
		args = &TenantArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Tenant
	err := ctx.RegisterResource("auth0:index/tenant:Tenant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTenant gets an existing Tenant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTenant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TenantState, opts ...pulumi.ResourceOption) (*Tenant, error) {
	var resource Tenant
	err := ctx.ReadResource("auth0:index/tenant:Tenant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tenant resources.
type tenantState struct {
	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi *bool `pulumi:"allowOrganizationNameInAuthenticationApi"`
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience *string `pulumi:"defaultAudience"`
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory *string `pulumi:"defaultDirectory"`
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri *string `pulumi:"defaultRedirectionUri"`
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales []string `pulumi:"enabledLocales"`
	// Configuration settings for tenant flags.
	Flags *TenantFlags `pulumi:"flags"`
	// Friendly name for the tenant.
	FriendlyName *string `pulumi:"friendlyName"`
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime *float64 `pulumi:"idleSessionLifetime"`
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl *string `pulumi:"pictureUrl"`
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion *string `pulumi:"sandboxVersion"`
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookie *TenantSessionCookie `pulumi:"sessionCookie"`
	// Number of hours during which a session will stay valid.
	SessionLifetime *float64 `pulumi:"sessionLifetime"`
	// Sessions related settings for the tenant.
	Sessions *TenantSessions `pulumi:"sessions"`
	// Support email address for authenticating users.
	SupportEmail *string `pulumi:"supportEmail"`
	// Support URL for authenticating users.
	SupportUrl *string `pulumi:"supportUrl"`
}

type TenantState struct {
	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi pulumi.BoolPtrInput
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayInput
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringPtrInput
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringPtrInput
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri pulumi.StringPtrInput
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayInput
	// Configuration settings for tenant flags.
	Flags TenantFlagsPtrInput
	// Friendly name for the tenant.
	FriendlyName pulumi.StringPtrInput
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrInput
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringPtrInput
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringPtrInput
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookie TenantSessionCookiePtrInput
	// Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrInput
	// Sessions related settings for the tenant.
	Sessions TenantSessionsPtrInput
	// Support email address for authenticating users.
	SupportEmail pulumi.StringPtrInput
	// Support URL for authenticating users.
	SupportUrl pulumi.StringPtrInput
}

func (TenantState) ElementType() reflect.Type {
	return reflect.TypeOf((*tenantState)(nil)).Elem()
}

type tenantArgs struct {
	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi *bool `pulumi:"allowOrganizationNameInAuthenticationApi"`
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience *string `pulumi:"defaultAudience"`
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory *string `pulumi:"defaultDirectory"`
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri *string `pulumi:"defaultRedirectionUri"`
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales []string `pulumi:"enabledLocales"`
	// Configuration settings for tenant flags.
	Flags *TenantFlags `pulumi:"flags"`
	// Friendly name for the tenant.
	FriendlyName *string `pulumi:"friendlyName"`
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime *float64 `pulumi:"idleSessionLifetime"`
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl *string `pulumi:"pictureUrl"`
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion *string `pulumi:"sandboxVersion"`
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookie *TenantSessionCookie `pulumi:"sessionCookie"`
	// Number of hours during which a session will stay valid.
	SessionLifetime *float64 `pulumi:"sessionLifetime"`
	// Sessions related settings for the tenant.
	Sessions *TenantSessions `pulumi:"sessions"`
	// Support email address for authenticating users.
	SupportEmail *string `pulumi:"supportEmail"`
	// Support URL for authenticating users.
	SupportUrl *string `pulumi:"supportUrl"`
}

// The set of arguments for constructing a Tenant resource.
type TenantArgs struct {
	// Whether to accept an organization name instead of an ID on auth endpoints.
	AllowOrganizationNameInAuthenticationApi pulumi.BoolPtrInput
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayInput
	// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringPtrInput
	// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringPtrInput
	// The default absolute redirection URI. Must be HTTPS or an empty string.
	DefaultRedirectionUri pulumi.StringPtrInput
	// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayInput
	// Configuration settings for tenant flags.
	Flags TenantFlagsPtrInput
	// Friendly name for the tenant.
	FriendlyName pulumi.StringPtrInput
	// Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrInput
	// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringPtrInput
	// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringPtrInput
	// Alters behavior of tenant's session cookie. Contains a single `mode` property.
	SessionCookie TenantSessionCookiePtrInput
	// Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrInput
	// Sessions related settings for the tenant.
	Sessions TenantSessionsPtrInput
	// Support email address for authenticating users.
	SupportEmail pulumi.StringPtrInput
	// Support URL for authenticating users.
	SupportUrl pulumi.StringPtrInput
}

func (TenantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tenantArgs)(nil)).Elem()
}

type TenantInput interface {
	pulumi.Input

	ToTenantOutput() TenantOutput
	ToTenantOutputWithContext(ctx context.Context) TenantOutput
}

func (*Tenant) ElementType() reflect.Type {
	return reflect.TypeOf((**Tenant)(nil)).Elem()
}

func (i *Tenant) ToTenantOutput() TenantOutput {
	return i.ToTenantOutputWithContext(context.Background())
}

func (i *Tenant) ToTenantOutputWithContext(ctx context.Context) TenantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantOutput)
}

// TenantArrayInput is an input type that accepts TenantArray and TenantArrayOutput values.
// You can construct a concrete instance of `TenantArrayInput` via:
//
//	TenantArray{ TenantArgs{...} }
type TenantArrayInput interface {
	pulumi.Input

	ToTenantArrayOutput() TenantArrayOutput
	ToTenantArrayOutputWithContext(context.Context) TenantArrayOutput
}

type TenantArray []TenantInput

func (TenantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tenant)(nil)).Elem()
}

func (i TenantArray) ToTenantArrayOutput() TenantArrayOutput {
	return i.ToTenantArrayOutputWithContext(context.Background())
}

func (i TenantArray) ToTenantArrayOutputWithContext(ctx context.Context) TenantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantArrayOutput)
}

// TenantMapInput is an input type that accepts TenantMap and TenantMapOutput values.
// You can construct a concrete instance of `TenantMapInput` via:
//
//	TenantMap{ "key": TenantArgs{...} }
type TenantMapInput interface {
	pulumi.Input

	ToTenantMapOutput() TenantMapOutput
	ToTenantMapOutputWithContext(context.Context) TenantMapOutput
}

type TenantMap map[string]TenantInput

func (TenantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tenant)(nil)).Elem()
}

func (i TenantMap) ToTenantMapOutput() TenantMapOutput {
	return i.ToTenantMapOutputWithContext(context.Background())
}

func (i TenantMap) ToTenantMapOutputWithContext(ctx context.Context) TenantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantMapOutput)
}

type TenantOutput struct{ *pulumi.OutputState }

func (TenantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tenant)(nil)).Elem()
}

func (o TenantOutput) ToTenantOutput() TenantOutput {
	return o
}

func (o TenantOutput) ToTenantOutputWithContext(ctx context.Context) TenantOutput {
	return o
}

// Whether to accept an organization name instead of an ID on auth endpoints.
func (o TenantOutput) AllowOrganizationNameInAuthenticationApi() pulumi.BoolOutput {
	return o.ApplyT(func(v *Tenant) pulumi.BoolOutput { return v.AllowOrganizationNameInAuthenticationApi }).(pulumi.BoolOutput)
}

// URLs that Auth0 may redirect to after logout.
func (o TenantOutput) AllowedLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringArrayOutput { return v.AllowedLogoutUrls }).(pulumi.StringArrayOutput)
}

// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
func (o TenantOutput) DefaultAudience() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultAudience }).(pulumi.StringOutput)
}

// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
func (o TenantOutput) DefaultDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultDirectory }).(pulumi.StringOutput)
}

// The default absolute redirection URI. Must be HTTPS or an empty string.
func (o TenantOutput) DefaultRedirectionUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultRedirectionUri }).(pulumi.StringOutput)
}

// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
func (o TenantOutput) EnabledLocales() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringArrayOutput { return v.EnabledLocales }).(pulumi.StringArrayOutput)
}

// Configuration settings for tenant flags.
func (o TenantOutput) Flags() TenantFlagsOutput {
	return o.ApplyT(func(v *Tenant) TenantFlagsOutput { return v.Flags }).(TenantFlagsOutput)
}

// Friendly name for the tenant.
func (o TenantOutput) FriendlyName() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.FriendlyName }).(pulumi.StringOutput)
}

// Number of hours during which a session can be inactive before the user must log in again.
func (o TenantOutput) IdleSessionLifetime() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Tenant) pulumi.Float64PtrOutput { return v.IdleSessionLifetime }).(pulumi.Float64PtrOutput)
}

// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
func (o TenantOutput) PictureUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.PictureUrl }).(pulumi.StringOutput)
}

// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
func (o TenantOutput) SandboxVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SandboxVersion }).(pulumi.StringOutput)
}

// Alters behavior of tenant's session cookie. Contains a single `mode` property.
func (o TenantOutput) SessionCookie() TenantSessionCookieOutput {
	return o.ApplyT(func(v *Tenant) TenantSessionCookieOutput { return v.SessionCookie }).(TenantSessionCookieOutput)
}

// Number of hours during which a session will stay valid.
func (o TenantOutput) SessionLifetime() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Tenant) pulumi.Float64PtrOutput { return v.SessionLifetime }).(pulumi.Float64PtrOutput)
}

// Sessions related settings for the tenant.
func (o TenantOutput) Sessions() TenantSessionsOutput {
	return o.ApplyT(func(v *Tenant) TenantSessionsOutput { return v.Sessions }).(TenantSessionsOutput)
}

// Support email address for authenticating users.
func (o TenantOutput) SupportEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SupportEmail }).(pulumi.StringOutput)
}

// Support URL for authenticating users.
func (o TenantOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SupportUrl }).(pulumi.StringOutput)
}

type TenantArrayOutput struct{ *pulumi.OutputState }

func (TenantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tenant)(nil)).Elem()
}

func (o TenantArrayOutput) ToTenantArrayOutput() TenantArrayOutput {
	return o
}

func (o TenantArrayOutput) ToTenantArrayOutputWithContext(ctx context.Context) TenantArrayOutput {
	return o
}

func (o TenantArrayOutput) Index(i pulumi.IntInput) TenantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tenant {
		return vs[0].([]*Tenant)[vs[1].(int)]
	}).(TenantOutput)
}

type TenantMapOutput struct{ *pulumi.OutputState }

func (TenantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tenant)(nil)).Elem()
}

func (o TenantMapOutput) ToTenantMapOutput() TenantMapOutput {
	return o
}

func (o TenantMapOutput) ToTenantMapOutputWithContext(ctx context.Context) TenantMapOutput {
	return o
}

func (o TenantMapOutput) MapIndex(k pulumi.StringInput) TenantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tenant {
		return vs[0].(map[string]*Tenant)[vs[1].(string)]
	}).(TenantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TenantInput)(nil)).Elem(), &Tenant{})
	pulumi.RegisterInputType(reflect.TypeOf((*TenantArrayInput)(nil)).Elem(), TenantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TenantMapInput)(nil)).Elem(), TenantMap{})
	pulumi.RegisterOutputType(TenantOutput{})
	pulumi.RegisterOutputType(TenantArrayOutput{})
	pulumi.RegisterOutputType(TenantMapOutput{})
}
